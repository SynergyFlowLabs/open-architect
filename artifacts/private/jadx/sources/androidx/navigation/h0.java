package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.g0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class h0<Args extends g0> implements kotlin.f0<Args> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlin.reflect.d<Args> f71017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<Bundle> f71018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Args f71019c;

    public h0(@NotNull kotlin.reflect.d<Args> navArgsClass, @NotNull Function0<Bundle> argumentProducer) {
        Intrinsics.checkNotNullParameter(navArgsClass, "navArgsClass");
        Intrinsics.checkNotNullParameter(argumentProducer, "argumentProducer");
        this.f71017a = navArgsClass;
        this.f71018b = argumentProducer;
    }

    @Override // kotlin.f0
    public boolean Z() {
        return this.f71019c != null;
    }

    @Override // kotlin.f0
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Args getValue() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Args args = this.f71019c;
        if (args != null) {
            return args;
        }
        Bundle bundleInvoke = this.f71018b.invoke();
        Method method = i0.a().get(this.f71017a);
        if (method == null) {
            Class clsE = oj.b.e(this.f71017a);
            Class<Bundle>[] clsArrB = i0.b();
            method = clsE.getMethod("fromBundle", (Class[]) Arrays.copyOf(clsArrB, clsArrB.length));
            i0.a().put(this.f71017a, method);
            Intrinsics.checkNotNullExpressionValue(method, "also(...)");
        }
        Object objInvoke = method.invoke(null, bundleInvoke);
        Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
        Args args2 = (Args) objInvoke;
        this.f71019c = args2;
        return args2;
    }
}
