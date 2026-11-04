package kotlin.enums;

import java.io.Serializable;
import java.lang.Enum;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class e<E extends Enum<E>> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final a f312497b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f312498c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Class<E> f312499a;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public e(@NotNull E[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        Class<E> cls = (Class<E>) entries.getClass().getComponentType();
        Intrinsics.checkNotNull(cls);
        this.f312499a = cls;
    }

    private final Object readResolve() {
        E[] enumConstants = this.f312499a.getEnumConstants();
        Intrinsics.checkNotNullExpressionValue(enumConstants, "getEnumConstants(...)");
        return c.c(enumConstants);
    }
}
