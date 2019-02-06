package com.khzero.rest.domain.projection;

import com.khzero.rest.domain.Board;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "getOnlyTitle", types = { Board.class })
public interface BoardOnlyContainTItle {
    String getTItle();
}
