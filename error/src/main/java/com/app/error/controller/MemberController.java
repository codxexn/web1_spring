package com.app.error.controller;

import com.app.error.domain.MemberVO;
import com.app.error.exception.CustomException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpSession;
import java.util.Optional;

@Controller
@RequestMapping("/member/*")
public class MemberController {

    @GetMapping("login")
    public void goToLoginForm(MemberVO memberVO, @RequestParam(required = false) Boolean login, Model model){
        model.addAttribute("login", login);
    }

    @PostMapping("login")
    public RedirectView checkLogin(MemberVO memberVO, HttpSession session){
//        파라미터 검사가 JS에서 불가능할 시 아래와 같이 막을 수 있다.
        if(memberVO.getId() == null){
            throw new CustomException("ddd");
        }
        MemberVO member = login(memberVO).orElseThrow(() -> {throw new CustomException("로그인 실패");});
        session.setAttribute("member", member);
        return new RedirectView("/");
    }

    public Optional<MemberVO> login(MemberVO memberVO){
        MemberVO foundMember = null;
        if(memberVO.getId().equals("member") && memberVO.getPw().equals("1234")){
            foundMember = new MemberVO();
        }
        return Optional.ofNullable(foundMember);
    }
}
