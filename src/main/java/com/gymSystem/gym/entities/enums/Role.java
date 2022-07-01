package com.gymSystem.gym.entities.enums;

public enum Role {
    ADMIN(0),
    STAFF(1),
    PERSONAL(2),
    SUPPORT(3),
    USER(4);

    private int code;

    Role(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    public static Role getRoleByCode(int code){
        for (Role role: Role.values()) {
            if (role.getCode() == code){
                return valueOf(role.name());
            }
        }
        throw new RuntimeException("Code not found!");
    }
}
