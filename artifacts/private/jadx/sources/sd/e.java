package sd;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@w0(parameters = 0)
@ij.f
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f375967b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final b f375968a;

    @ij.a
    public e(@NotNull b firebaseAvailability) {
        Intrinsics.checkNotNullParameter(firebaseAvailability, "firebaseAvailability");
        this.f375968a = firebaseAvailability;
    }

    public final void a(@NotNull d eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        if (this.f375968a.c()) {
            com.google.firebase.inappmessaging.m.m().x(eventName.n());
        }
    }
}
