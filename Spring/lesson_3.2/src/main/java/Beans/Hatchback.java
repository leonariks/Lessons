package Beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component()
@Scope("prototype")

public class Hatchback implements Car {
    public String accelerate() {
        return "Хетчбэк может разгоняться";
    }

    public String brake() {
        return "Хетчбэк может тормозить";
    }

    public String getName() {
        return "хетчбэк";
    }
}
