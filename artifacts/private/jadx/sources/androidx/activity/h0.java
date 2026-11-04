package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class h0 implements androidx.lifecycle.j0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final c f9910b = new c(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final kotlin.f0<a> f9911c = kotlin.g0.c(b.f9913a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Activity f9912a;

    public static abstract class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract boolean a(@NotNull InputMethodManager inputMethodManager);

        @Nullable
        public abstract Object b(@NotNull InputMethodManager inputMethodManager);

        @Nullable
        public abstract View c(@NotNull InputMethodManager inputMethodManager);

        private a() {
        }
    }

    @SourceDebugExtension({"SMAP\nImmLeaksCleaner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImmLeaksCleaner.kt\nandroidx/activity/ImmLeaksCleaner$Companion$cleaner$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,127:1\n1#2:128\n*E\n"})
    static final class b extends kotlin.jvm.internal.l0 implements Function0<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f9913a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final a invoke() {
            try {
                Field servedViewField = InputMethodManager.class.getDeclaredField("mServedView");
                servedViewField.setAccessible(true);
                Field nextServedViewField = InputMethodManager.class.getDeclaredField("mNextServedView");
                nextServedViewField.setAccessible(true);
                Field hField = InputMethodManager.class.getDeclaredField("mH");
                hField.setAccessible(true);
                Intrinsics.checkNotNullExpressionValue(hField, "hField");
                Intrinsics.checkNotNullExpressionValue(servedViewField, "servedViewField");
                Intrinsics.checkNotNullExpressionValue(nextServedViewField, "nextServedViewField");
                return new e(hField, servedViewField, nextServedViewField);
            } catch (NoSuchFieldException unused) {
                return d.f9914a;
            }
        }
    }

    @e.a({"SoonBlockedPrivateApi"})
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final a a() {
            return (a) h0.f9911c.getValue();
        }

        private c() {
        }
    }

    public static final class d extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f9914a = new d();

        private d() {
            super(null);
        }

        @Override // androidx.activity.h0.a
        public boolean a(@NotNull InputMethodManager inputMethodManager) {
            Intrinsics.checkNotNullParameter(inputMethodManager, "<this>");
            return false;
        }

        @Override // androidx.activity.h0.a
        @Nullable
        public Object b(@NotNull InputMethodManager inputMethodManager) {
            Intrinsics.checkNotNullParameter(inputMethodManager, "<this>");
            return null;
        }

        @Override // androidx.activity.h0.a
        @Nullable
        public View c(@NotNull InputMethodManager inputMethodManager) {
            Intrinsics.checkNotNullParameter(inputMethodManager, "<this>");
            return null;
        }
    }

    public static final class e extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Field f9915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final Field f9916b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final Field f9917c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@NotNull Field hField, @NotNull Field servedViewField, @NotNull Field nextServedViewField) {
            super(null);
            Intrinsics.checkNotNullParameter(hField, "hField");
            Intrinsics.checkNotNullParameter(servedViewField, "servedViewField");
            Intrinsics.checkNotNullParameter(nextServedViewField, "nextServedViewField");
            this.f9915a = hField;
            this.f9916b = servedViewField;
            this.f9917c = nextServedViewField;
        }

        @Override // androidx.activity.h0.a
        public boolean a(@NotNull InputMethodManager inputMethodManager) {
            Intrinsics.checkNotNullParameter(inputMethodManager, "<this>");
            try {
                this.f9917c.set(inputMethodManager, null);
                return true;
            } catch (IllegalAccessException unused) {
                return false;
            }
        }

        @Override // androidx.activity.h0.a
        @Nullable
        public Object b(@NotNull InputMethodManager inputMethodManager) {
            Intrinsics.checkNotNullParameter(inputMethodManager, "<this>");
            try {
                return this.f9915a.get(inputMethodManager);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // androidx.activity.h0.a
        @Nullable
        public View c(@NotNull InputMethodManager inputMethodManager) {
            Intrinsics.checkNotNullParameter(inputMethodManager, "<this>");
            try {
                return (View) this.f9916b.get(inputMethodManager);
            } catch (ClassCastException | IllegalAccessException unused) {
                return null;
            }
        }
    }

    public h0(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f9912a = activity;
    }

    @Override // androidx.lifecycle.j0
    public void e(@NotNull androidx.lifecycle.o0 source, @NotNull androidx.lifecycle.c0.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event != androidx.lifecycle.c0.a.ON_DESTROY) {
            return;
        }
        Object systemService = this.f9912a.getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        a aVarA = f9910b.a();
        Object objB = aVarA.b(inputMethodManager);
        if (objB == null) {
            return;
        }
        synchronized (objB) {
            try {
                View viewC = aVarA.c(inputMethodManager);
                if (viewC == null) {
                    return;
                }
                if (viewC.isAttachedToWindow()) {
                    return;
                }
                boolean zA = aVarA.a(inputMethodManager);
                if (zA) {
                    inputMethodManager.isActive();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
