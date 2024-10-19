# Java Login System

This project is a simple Java-based login system implemented via the command line. It allows users to enter their username and password to authenticate themselves. If the login credentials are incorrect, the user has the option to reset the password with certain conditions.

## Features

- User authentication with username and password.
- Password reset option in case of incorrect password.
- The new password cannot be the same as the old password.

## Usage

The program runs in the command line and interacts with the user to handle login operations. Below is a step-by-step explanation of how the system works:

1. The user is prompted to enter their username.
2. The user is then prompted to enter their password.
3. Based on the input, one of the following outcomes will occur:
   - **Successful Login**: If both the username and password match, a success message is displayed.
   - **Incorrect Password**: If the password is incorrect but the username is correct, the user is prompted to reset their password. The new password must be different from the old one.
   - **Incorrect Username**: If the username is incorrect but the password matches, an error message is displayed.
   - **Both Incorrect**: If both the username and password are incorrect, an error message is displayed.

## How to Run

To run this project, you need to have Java installed on your computer. Follow these steps:

1. Save the `Main.java` file.
2. Open a terminal and navigate to the directory where the file is saved.
3. Compile the program using the following command:

   ```sh
   javac Main.java
   ```

4. Run the program using the following command:

   ```sh
   java Main
   ```

5. Follow the prompts to enter your username and password.

## Example Output

```
Kullanıcı adınızı giriniz:
hekimm
Parolanızı giriniz:
gs1905M99
Sisteme başarıyla giriş yapıldı
```

Or if the password is incorrect:

```
Kullanıcı adınızı giriniz:
hekimm
Parolanızı giriniz:
wrongpassword
Parolanız hatalı !!
Şifrenizi sıfırlamak istiyor musunuz : Evet ise true, hayır ise false yazınız
true
Yeni parolanızı giriniz:
newpassword
Şifre oluşturuldu
Yeni parolanız : newpassword
```

## Code Overview

- **Username and Password Verification**: The program uses hardcoded values for the system username and password (`sys_username` and `sys_password`).
- **Password Reset**: If the user forgets their password, they can reset it, but it must not be the same as the old password.
- **Loop for Password Reset**: The code ensures that the new password is different by using a `while` loop.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Author

- **Hekim Can Aktas** - [GitHub](https://github.com/hekimcanaktas)

