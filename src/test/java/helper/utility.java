package helper;

import org.apache.commons.lang3.RandomStringUtils;

import java.io.File;

public class utility {
    public static File jsonSchema(String filename) {
        return new File("src/test/java/helper/JsonSchema/" + filename);
    }

    public static String pembuatEmail() {
        String allowedChasrs = "abcdefghijklmnopqrstuvwxyz" + "1234567890" + "_-.";
        String email = "";
        String temp = RandomStringUtils.randomAlphanumeric(10);
        email = temp + "@testdata.com";
        return email;

    }
}
