package com.liyong.demo.apis;

import java.util.List;

/**
 * <p>ClassName com.liyong.demo.apis.UserService  </p>
 * <p>Description TODO                   </p>
 * <p>Author mac                     </p>
 * <p>Date 2019-01-02 11:15               </p>
 * <p>Version 0.0.1                      </p>
 **/
public interface UserService {

    List<String> getUsers(Integer type);
}
