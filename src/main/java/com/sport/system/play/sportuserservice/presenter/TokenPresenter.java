package com.sport.system.play.sportuserservice.presenter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TokenPresenter {

    private String token;
    private UserPresenter userPresenter;
}
