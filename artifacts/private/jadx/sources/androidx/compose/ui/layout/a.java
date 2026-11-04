package androidx.compose.ui.layout;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.o2
public abstract class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C0300a f39236b = new C0300a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f39237c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f39238d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function2<Integer, Integer, Integer> f39239a;

    /* JADX INFO: renamed from: androidx.compose.ui.layout.a$a, reason: collision with other inner class name */
    public static final class C0300a {
        public /* synthetic */ C0300a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0300a() {
        }
    }

    public /* synthetic */ a(Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2);
    }

    @NotNull
    public final Function2<Integer, Integer, Integer> a() {
        return this.f39239a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private a(Function2<? super Integer, ? super Integer, Integer> function2) {
        this.f39239a = function2;
    }
}
