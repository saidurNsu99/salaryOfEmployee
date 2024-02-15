//package salaryOfEmployee.app.salaryOfEmployee;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//
//@RestController
//@RequestMapping("/auth")
//public class AuthController<LoginRequest> {
//    @Autowired
//    private AuthService authService;
//
//    @PostMapping("/login")
//    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
//        String token = authService.authenticate(loginRequest.getUsername(), loginRequest.getPassword());
//        return ResponseEntity.ok(new AuthResponse(token));
//    }
//
//    @PostMapping("/logout")
//    public ResponseEntity<?> logout(HttpServletRequest request) {
//        authService.logout(request);
//        return ResponseEntity.ok("Logout successful.");
//    }
//}
//