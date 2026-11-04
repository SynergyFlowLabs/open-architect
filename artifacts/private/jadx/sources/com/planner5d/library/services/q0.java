package com.planner5d.library.services;

import android.content.Context;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.f1;
import com.planner5d.library.services.utility.k3;
import com.planner5d.library.services.utility.o2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final q0 f224534a = new q0();

    public static final class a extends h<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull Context context) {
            super(context, o2.q.C8, new Function1() { // from class: com.planner5d.library.services.p0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(q0.a.c((String) obj));
                }
            });
            Intrinsics.checkNotNullParameter(context, "context");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean c(String str) {
            return q0.f224534a.b(str);
        }
    }

    public static final class b extends h<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull Context context, @NotNull final Function0<String> equalsTo) {
            super(context, o2.q.Qj, new Function1() { // from class: com.planner5d.library.services.r0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(q0.b.c(equalsTo, (String) obj));
                }
            });
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(equalsTo, "equalsTo");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean c(Function0 function0, String str) {
            return q0.f224534a.c(str, function0);
        }
    }

    @SourceDebugExtension({"SMAP\nValidator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Validator.kt\ncom/planner5d/library/services/Validator$ValidatorIfVisible\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,86:1\n255#2:87\n*S KotlinDebug\n*F\n+ 1 Validator.kt\ncom/planner5d/library/services/Validator$ValidatorIfVisible\n*L\n81#1:87\n*E\n"})
    public static final class c<T> implements g<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final View f224535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final g<T> f224536b;

        public c(@NotNull View view, @NotNull g<T> validator) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(validator, "validator");
            this.f224535a = view;
            this.f224536b = validator;
        }

        @Override // com.planner5d.library.services.q0.g
        @Nullable
        public String a(T t10) {
            if (this.f224535a.getVisibility() == 0) {
                return this.f224536b.a(t10);
            }
            return null;
        }
    }

    public static final class d extends h<Boolean> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull Context context) {
            super(context, o2.q.Ka, new Function1() { // from class: com.planner5d.library.services.s0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(q0.d.c((Boolean) obj));
                }
            });
            Intrinsics.checkNotNullParameter(context, "context");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean c(Boolean bool) {
            return q0.f224534a.d(bool);
        }
    }

    public static final class e extends h<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@NotNull Context context, final int i10) {
            super(context, new k3(o2.q.f227818a9, Integer.valueOf(i10)), new Function1() { // from class: com.planner5d.library.services.t0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(q0.e.c(i10, (String) obj));
                }
            });
            Intrinsics.checkNotNullParameter(context, "context");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean c(int i10, String str) {
            return q0.f224534a.f(str, i10);
        }
    }

    public static final class f extends h<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(@NotNull Context context) {
            super(context, o2.q.La, new Function1() { // from class: com.planner5d.library.services.u0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(q0.f.c((String) obj));
                }
            });
            Intrinsics.checkNotNullParameter(context, "context");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean c(String str) {
            return q0.f224534a.h(str);
        }
    }

    public interface g<T> {
        @Nullable
        String a(T t10);
    }

    private q0() {
    }

    public final boolean a(@NotNull TextView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return b(view.getText().toString());
    }

    public final boolean b(@Nullable String str) {
        return str == null || str.length() == 0 || Patterns.EMAIL_ADDRESS.matcher(str).matches();
    }

    public final boolean c(@Nullable String str, @NotNull Function0<String> equalToValue) {
        Intrinsics.checkNotNullParameter(equalToValue, "equalToValue");
        return str != null && Intrinsics.areEqual(str, equalToValue.invoke());
    }

    public final boolean d(@Nullable Boolean bool) {
        return bool != null && bool.booleanValue();
    }

    public final boolean e(@NotNull TextView view, int i10) {
        Intrinsics.checkNotNullParameter(view, "view");
        return f(view.getText().toString(), i10);
    }

    public final boolean f(@Nullable String str, int i10) {
        if (str != null && str.length() < i10) {
            return false;
        }
        return true;
    }

    public final boolean g(@NotNull TextView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return h(view.getText().toString());
    }

    public final boolean h(@Nullable String str) {
        return str != null && StringsKt.E5(str).toString().length() > 0;
    }

    public final boolean i(@NotNull TextView view, @Nullable String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        return j(view.getText().toString(), str);
    }

    public final boolean j(@Nullable String str, @Nullable String str2) {
        return str == null || !Intrinsics.areEqual(str, str2);
    }

    public final boolean k(@Nullable String str, int i10) {
        return str == null || str.length() < i10;
    }

    public static class h<T> implements g<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f224537a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final Function1<T, Boolean> f224538b;

        /* JADX WARN: Multi-variable type inference failed */
        public h(@NotNull String message, @NotNull Function1<? super T, Boolean> isValid) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(isValid, "isValid");
            this.f224537a = message;
            this.f224538b = isValid;
        }

        @Override // com.planner5d.library.services.q0.g
        @Nullable
        public String a(T t10) {
            if (this.f224538b.invoke(t10).booleanValue()) {
                return null;
            }
            return this.f224537a;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public h(@NotNull Context context, @f1 int i10, @NotNull Function1<? super T, Boolean> isValid) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(isValid, "isValid");
            String string = context.getString(i10);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            this(string, isValid);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public h(@NotNull Context context, @NotNull k3 message, @NotNull Function1<? super T, Boolean> isValid) {
            this(message.i(context).toString(), isValid);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(isValid, "isValid");
        }
    }
}
