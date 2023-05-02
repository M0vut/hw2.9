package homework29.zaicev.homework29.service;

import homework29.zaicev.homework29.exception.EmployeeNotFoundException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service
public class ValidatorService {
    public String validateFirstName(String firstNames) {
        if (!StringUtils.isAlpha(firstNames)) {
            throw new EmployeeNotFoundException();
        }
        return StringUtils.capitalize(firstNames.toLowerCase());
    }
    public String validateLastName(String lastName){
    String[] lastNames = lastName.split("-");
        for (int i = 0; i < lastNames.length; i++) {
            if (!StringUtils.isAlpha(lastName)) {
                throw new EmployeeNotFoundException();
            }
            lastNames[i] = StringUtils.capitalize(lastNames[i].toLowerCase());
        }
        return String.join("-",lastNames);
    }
}
