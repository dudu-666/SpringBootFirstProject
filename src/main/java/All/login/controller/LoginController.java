package All.login.controller;

import All.login.dao.Account;
import All.login.dao.NewAccount;
import All.login.dao.Resetdao;
import All.login.model.GMLoginModel;
import All.login.dao.User;
import All.login.model.NewAccountModel;
import All.login.model.ResetPasswordModel;
import All.login.model.UserLoginModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.SQLException;

@Controller
public class LoginController {
    @RequestMapping(value = "GMLoginController",method = RequestMethod.POST)
    public String GMLogin(Account account) {
        GMLoginModel loginDao = new GMLoginModel(account);
        try {
            if (loginDao.Login() == 1) {
                return "Main";
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return "GMLogin";
    }
    @RequestMapping(value = "UserLoginController",method = RequestMethod.POST)
    public String UserLogin(User user){
        UserLoginModel userLoginModel=new UserLoginModel(user);
        try {
            if (userLoginModel.Login() == 1) {
                return "Main01";
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return "UserLogin";
    }
    @RequestMapping(value = "ResetController",method = RequestMethod.POST)
    public String Reset(Resetdao resetdao){
        ResetPasswordModel resetPasswordModel=new ResetPasswordModel();
        resetPasswordModel.setUname(resetdao.getUname());
        resetPasswordModel.setUpassword(resetdao.getUpassword1());
        if(resetdao.getChecknum()%2==0){
            if(resetdao.getUpassword1().equals(resetdao.getUpassword2())) {
                try {
                    if(resetPasswordModel.Reset()==1)
                        return "Login";
                } catch (SQLException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }else System.out.println(resetdao.getUpassword1().equals(resetdao.getUpassword2()));
        }else System.out.println(resetdao.getChecknum()%2);
        return "ResetPassword";
    }
    @RequestMapping(value = "NewAccountController",method = RequestMethod.POST)
    public String NewAccount(NewAccount account){
        NewAccountModel newAccountModel=new NewAccountModel();
        newAccountModel.setUname(account.getUname());
        newAccountModel.setAccount(account.getAccount());
        if(account.getUpassword1().equals(account.getUpassword2())) {
            newAccountModel.setUpassword(account.getUpassword1());
            try {
                if(newAccountModel.create()==1)
                    return "Login";
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return "ResetPassword";
    }
}
