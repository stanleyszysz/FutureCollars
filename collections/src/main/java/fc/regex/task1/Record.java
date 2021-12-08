package fc.regex.task1;

import java.util.Optional;

public class Record {
    String fullName, address;
    Optional<String> phoneNumber;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Optional<String> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Optional<String> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        String phoneNumberUnwrapped = "";
        if (phoneNumber.isPresent()) {
            phoneNumberUnwrapped = phoneNumber.get();
        }
        return fullName + " " + address + " " + phoneNumberUnwrapped;
    }
}
