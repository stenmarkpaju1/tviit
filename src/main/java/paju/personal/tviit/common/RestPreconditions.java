package paju.personal.tviit.common;

import paju.personal.tviit.common.exceptions.ResourceNotFoundException;

import java.util.Optional;

public final class RestPreconditions {

    private RestPreconditions() {
        throw new AssertionError();
    }

    /**
     * Check if some value was found, otherwise throw exception.
     *
     * @param expression has value true if found, otherwise false
     * @throws ResourceNotFoundException if expression is false, means value not found.
     */
    public static void checkFound(final boolean expression) {
        if (!expression) {
            throw new ResourceNotFoundException();
        }
    }

    /**
     * Check if some value was found, otherwise throw exception.
     *
     * @throws ResourceNotFoundException if expression is false, means value not found.
     */
    public static <T> T checkFound(final T resource) {
        if (resource == null) {
            throw new ResourceNotFoundException();
        }

        return resource;
    }

    /**
     * Check if some value was found, otherwise throw exception.
     *
     * @throws ResourceNotFoundException if expression is false, means value not found.
     */
    public static <T> T checkFound(final Optional<T> resource) {
        if (!resource.isPresent()) {
            throw new ResourceNotFoundException();
        }

        return resource.get();
    }

    public static <T> T checkFound(final Optional<T> resource, String error) {
        if (!resource.isPresent()) {
            throw new ResourceNotFoundException(error);
        }

        return resource.get();
    }
}
