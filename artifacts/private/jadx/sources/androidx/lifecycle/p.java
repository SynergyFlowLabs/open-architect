package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class p implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final DefaultLifecycleObserver f52461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final j0 f52462b;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52463a;

        static {
            int[] iArr = new int[c0.a.values().length];
            try {
                iArr[c0.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c0.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c0.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c0.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c0.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[c0.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[c0.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f52463a = iArr;
        }
    }

    public p(@NotNull DefaultLifecycleObserver defaultLifecycleObserver, @Nullable j0 j0Var) {
        Intrinsics.checkNotNullParameter(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f52461a = defaultLifecycleObserver;
        this.f52462b = j0Var;
    }

    @Override // androidx.lifecycle.j0
    public void e(@NotNull o0 source, @NotNull c0.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        switch (a.f52463a[event.ordinal()]) {
            case 1:
                this.f52461a.onCreate(source);
                break;
            case 2:
                this.f52461a.onStart(source);
                break;
            case 3:
                this.f52461a.onResume(source);
                break;
            case 4:
                this.f52461a.onPause(source);
                break;
            case 5:
                this.f52461a.onStop(source);
                break;
            case 6:
                this.f52461a.onDestroy(source);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                throw new kotlin.k0();
        }
        j0 j0Var = this.f52462b;
        if (j0Var != null) {
            j0Var.e(source, event);
        }
    }
}
