package sd;

import androidx.compose.runtime.internal.w0;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplay;
import com.google.firebase.inappmessaging.model.MessageType;
import com.google.firebase.inappmessaging.r;
import com.planner5d.library.activity.fragment.dialog.message.MessageWithImageDialog;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@w0(parameters = 0)
public final class m implements FirebaseInAppMessagingDisplay {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f375983b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.dialog.k f375984a;

    public m(@NotNull com.planner5d.library.activity.fragment.dialog.k dialogLauncher) {
        Intrinsics.checkNotNullParameter(dialogLauncher, "dialogLauncher");
        this.f375984a = dialogLauncher;
    }

    @NotNull
    public final com.planner5d.library.activity.fragment.dialog.k a() {
        return this.f375984a;
    }

    @Override // com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplay
    public void displayMessage(@NotNull com.google.firebase.inappmessaging.model.i inAppMessage, @NotNull r callbacks) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        if (inAppMessage.l() == MessageType.MODAL) {
            this.f375984a.c(MessageWithImageDialog.class).k(inAppMessage).g();
        }
    }
}
