package com.amigos.recyclerview_mvc;

public class Item {
    String name;
    String email;
            int imge;

    public Item(String name, String email, int imge) {
        this.name = name;
        this.email = email;
        this.imge = imge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getImge() {
        return imge;
    }

    public void setImge(int imge) {
        this.imge = imge;
    }
}
