package com.khzero.rest.domain.projection;

import com.khzero.rest.domain.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "getOnlyName", types = { User.class })
public interface UserOnlyContainName {
    String getName();
}