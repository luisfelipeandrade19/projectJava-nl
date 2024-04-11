package rocketseat.com.passin.dto.event;

import jakarta.persistence.criteria.CriteriaBuilder;

public record EventDetailDTO(
        String id,

        String title,

        String details,

        String slug,

        Integer maximumAttendees,

        Integer attendeesAmount
) {
}
