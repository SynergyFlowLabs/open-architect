package io.intercom.android.sdk.helpcenter.utils;

import androidx.compose.runtime.internal.w0;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class HelpCenterEligibilityChecker {
    public static final int $stable = 0;

    @NotNull
    public static final HelpCenterEligibilityChecker INSTANCE = new HelpCenterEligibilityChecker();

    private HelpCenterEligibilityChecker() {
    }

    public final boolean isEligibleUser() {
        Twig logger = LumberMill.getLogger();
        UserIdentity userIdentity = Injector.get().getUserIdentity();
        if (userIdentity.identityExists() && !userIdentity.isSoftReset()) {
            return true;
        }
        logger.e("The app config has not been retrieved, please call registerUnidentifiedUser() or registerIdentifiedUser(Registration) before calling displayHelpCenter().", new Object[0]);
        return false;
    }
}
