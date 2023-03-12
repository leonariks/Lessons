package Beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component()
@Scope("singleton")
@Lazy
public class Jeep implements Car {

    public String accelerate() {
        return "Внедорожник может разгоняться";
    }

    public String brake() {
        return "Внедорожник может тормозить";
    }

    public String getName() {
        return "внедорожник";
    }
}
