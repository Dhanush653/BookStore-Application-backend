package com.bridgelabz.bookstoreapplication.user.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class ForgetPasswordDTO {
    String user_email;
}
