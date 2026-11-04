package io.ktor.websocket;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.b1;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final short f297185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f297186b;

    /* JADX INFO: renamed from: io.ktor.websocket.a$a, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nCloseReason.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CloseReason.kt\nio/ktor/websocket/CloseReason$Codes\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,83:1\n1208#2,2:84\n1236#2,4:86\n*S KotlinDebug\n*F\n+ 1 CloseReason.kt\nio/ktor/websocket/CloseReason$Codes\n*L\n58#1:84,2\n58#1:86,4\n*E\n"})
    public enum EnumC2106a {
        NORMAL(1000),
        GOING_AWAY(1001),
        PROTOCOL_ERROR(1002),
        CANNOT_ACCEPT(1003),
        CLOSED_ABNORMALLY(1006),
        NOT_CONSISTENT(1007),
        VIOLATED_POLICY(1008),
        TOO_BIG(1009),
        NO_EXTENSION(1010),
        INTERNAL_ERROR(1011),
        SERVICE_RESTART(1012),
        TRY_AGAIN_LATER(1013);


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private static final Map<Short, EnumC2106a> f297188c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @oj.f
        @NotNull
        public static final EnumC2106a f297189d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final short f297204a;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f297203v = kotlin.enums.c.c(k());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final C2107a f297187b = new C2107a(null);

        /* JADX INFO: renamed from: io.ktor.websocket.a$a$a, reason: collision with other inner class name */
        public static final class C2107a {
            public /* synthetic */ C2107a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @kotlin.l(level = kotlin.n.ERROR, message = "Use INTERNAL_ERROR instead.", replaceWith = @b1(expression = "INTERNAL_ERROR", imports = {"io.ktor.websocket.CloseReason.Codes.INTERNAL_ERROR"}))
            public static /* synthetic */ void b() {
            }

            @Nullable
            public final EnumC2106a a(short s10) {
                return (EnumC2106a) EnumC2106a.f297188c.get(Short.valueOf(s10));
            }

            private C2107a() {
            }
        }

        static {
            kotlin.enums.a<EnumC2106a> aVarO = o();
            LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.r.u(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(aVarO, 10)), 16));
            for (EnumC2106a enumC2106a : aVarO) {
                linkedHashMap.put(Short.valueOf(enumC2106a.f297204a), enumC2106a);
            }
            f297188c = linkedHashMap;
            f297189d = INTERNAL_ERROR;
        }

        EnumC2106a(short s10) {
            this.f297204a = s10;
        }

        @NotNull
        public static kotlin.enums.a<EnumC2106a> o() {
            return f297203v;
        }

        public final short n() {
            return this.f297204a;
        }
    }

    public a(short s10, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f297185a = s10;
        this.f297186b = message;
    }

    public static /* synthetic */ a d(a aVar, short s10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            s10 = aVar.f297185a;
        }
        if ((i10 & 2) != 0) {
            str = aVar.f297186b;
        }
        return aVar.c(s10, str);
    }

    public final short a() {
        return this.f297185a;
    }

    @NotNull
    public final String b() {
        return this.f297186b;
    }

    @NotNull
    public final a c(short s10, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new a(s10, message);
    }

    public final short e() {
        return this.f297185a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f297185a == aVar.f297185a && Intrinsics.areEqual(this.f297186b, aVar.f297186b);
    }

    @Nullable
    public final EnumC2106a f() {
        return EnumC2106a.f297187b.a(this.f297185a);
    }

    @NotNull
    public final String g() {
        return this.f297186b;
    }

    public int hashCode() {
        return (Short.hashCode(this.f297185a) * 31) + this.f297186b.hashCode();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CloseReason(reason=");
        Object objF = f();
        if (objF == null) {
            objF = Short.valueOf(this.f297185a);
        }
        sb2.append(objF);
        sb2.append(", message=");
        sb2.append(this.f297186b);
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(@NotNull EnumC2106a code, @NotNull String message) {
        this(code.n(), message);
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
