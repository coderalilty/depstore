package com.test.depstore.model.mapper;

import com.test.depstore.model.Position;
import com.test.depstore.model.dto.PositionDto;

public class PositionDtoMapper {

    public PositionDto entityToDTo(Position position){
        PositionDto positionDto = new PositionDto();
        positionDto.setId(position.getId());
        positionDto.setFullName(position.getFullName());
        return positionDto;
    }
}
