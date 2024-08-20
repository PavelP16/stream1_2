package validatiom;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import service.ParameterValidatorException;

import java.text.ParseException;

@ResponseStatus(HttpStatus.BAD_REQUEST)

public class ParameterValidator {

    public String checkAndCapitalize(String param) {
        if (!StringUtils.isAlpha(param)) {
            throw new ParameterValidatorException(param);
        }
        return StringUtils.capitalize(param.toLowerCase());
    }
}
