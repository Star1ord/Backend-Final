package com.nurzhasisthegreatest.final_goi_mynau;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RegistrationRequest {
    String username;
    String password;
}

