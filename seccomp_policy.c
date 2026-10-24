#include "include/seccomp_policy.h"

bool set_app_seccomp_filter(void) {
    return true;
}

bool set_app_zygote_seccomp_filter(void) {
    return true;
}

bool set_system_seccomp_filter(void) {
    return true;
}

bool install_setuidgid_seccomp_filter(uid_t min, uid_t max) {
    (void)min;
    (void)max;
    return true;
}
