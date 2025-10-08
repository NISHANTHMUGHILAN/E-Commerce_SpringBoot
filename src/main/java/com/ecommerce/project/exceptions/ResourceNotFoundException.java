package com.ecommerce.project.exceptions;

public class ResourceNotFoundException extends RuntimeException
{
    String resourceName;
    String field;
    String fieldName;
    Long fieldId;

    public ResourceNotFoundException() {
    }

    public ResourceNotFoundException(String resourceName, String field, String fieldName, Long fieldId)
    {
        super(String.format("%s not found with name %s and id %s", resourceName, fieldName, fieldId));
        this.resourceName = resourceName;
        this.field = field;
        this.fieldName = fieldName;
    }
    public ResourceNotFoundException(String resourceName, String field, Long fieldId)
    {
        super(String.format("%s not found with name %s and id %d", resourceName, field, fieldId));
        this.resourceName = resourceName;
        this.field = field;
        this.fieldId = fieldId;
    }

}
