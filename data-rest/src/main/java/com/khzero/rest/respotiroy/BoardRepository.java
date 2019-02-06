package com.khzero.rest.respotiroy;

import com.khzero.rest.domain.Board;
import com.khzero.rest.domain.projection.BoardOnlyContainTItle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;

@RepositoryRestResource(excerptProjection = BoardOnlyContainTItle.class)
public interface BoardRepository extends JpaRepository<Board, Long> {
    @Override
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    <S extends Board> S save(S entity);
}
