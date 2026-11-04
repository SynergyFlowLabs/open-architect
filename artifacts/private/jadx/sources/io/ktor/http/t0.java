package io.ktor.http;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nHeaderValueWithParameters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeaderValueWithParameters.kt\nio/ktor/http/HeaderValueWithParameters\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 HeaderValueWithParameters.kt\nio/ktor/http/HeaderValueWithParametersKt\n*L\n1#1,165:1\n1#2:166\n97#3,5:167\n*S KotlinDebug\n*F\n+ 1 HeaderValueWithParameters.kt\nio/ktor/http/HeaderValueWithParameters\n*L\n57#1:167,5\n*E\n"})
public abstract class t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f296102c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f296103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<s0> f296104b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <R> R a(@NotNull String value, @NotNull Function2<? super String, ? super List<s0>, ? extends R> init) {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(init, "init");
            r0 r0Var = (r0) CollectionsKt.last((List) c1.f(value));
            return init.invoke(r0Var.g(), r0Var.e());
        }

        private a() {
        }
    }

    public t0(@NotNull String content, @NotNull List<s0> parameters) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f296103a = content;
        this.f296104b = parameters;
    }

    @NotNull
    protected final String a() {
        return this.f296103a;
    }

    @NotNull
    public final List<s0> b() {
        return this.f296104b;
    }

    @Nullable
    public final String c(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int lastIndex = CollectionsKt.getLastIndex(this.f296104b);
        if (lastIndex >= 0) {
            int i10 = 0;
            while (true) {
                s0 s0Var = this.f296104b.get(i10);
                if (StringsKt.N1(s0Var.g(), name, true)) {
                    return s0Var.h();
                }
                if (i10 != lastIndex) {
                    i10++;
                }
            }
        }
        return null;
    }

    @NotNull
    public String toString() {
        if (this.f296104b.isEmpty()) {
            return this.f296103a;
        }
        int length = this.f296103a.length();
        int i10 = 0;
        int length2 = 0;
        for (s0 s0Var : this.f296104b) {
            length2 += s0Var.g().length() + s0Var.h().length() + 3;
        }
        StringBuilder sb2 = new StringBuilder(length + length2);
        sb2.append(this.f296103a);
        int lastIndex = CollectionsKt.getLastIndex(this.f296104b);
        if (lastIndex >= 0) {
            while (true) {
                s0 s0Var2 = this.f296104b.get(i10);
                sb2.append("; ");
                sb2.append(s0Var2.g());
                sb2.append("=");
                String strH = s0Var2.h();
                if (u0.f(strH)) {
                    sb2.append(u0.g(strH));
                } else {
                    sb2.append(strH);
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNull(string);
        return string;
    }

    public /* synthetic */ t0(String str, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? CollectionsKt.emptyList() : list);
    }
}
