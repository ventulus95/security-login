package com.ventulus95.securitylogin.controller;


import com.ventulus95.securitylogin.dto.MemberDto;
import com.ventulus95.securitylogin.service.MemberService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@AllArgsConstructor
@SessionAttributes("member")
@Controller
public class SignUpController {
//    private MemberService memberService;
//
//    // 회원가입 페이지
//    @GetMapping("/user/signup")
//    public String dispSignup(Model model) {
//        return "signup-id";
//    }
//
//    //회원가입 아이디
//    @PostMapping("/user/signup/email")
//    public String usersForEmailSubmit(@ModelAttribute MemberDto memberDto){
//        return "redirect:/user/signup/pass";
//    }
//    //회원가입 PW
//    @GetMapping("/user/signup/pass")
//    public String kk(@ModelAttribute MemberDto memberDto, Model model){
//        model.addAttribute("memberDto", memberDto);
//        return "signup-pass";
//    }
//
//    @PostMapping("/user/signup/pass")
//    public String post(@ModelAttribute MemberDto memberDto, SessionStatus sessionStatus){
//        sessionStatus.setComplete();
//        memberService.joinUser(memberDto);
//        return "redirect:/user/login";
//    }
//
//    // 회원가입 처리
//    @PostMapping("/user/signup")
//    public String execSignup(@ModelAttribute MemberDto memberDto) {
//        memberService.joinUser(memberDto);
//        return "redirect:/user/login";
//    }

}
