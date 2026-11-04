package e5;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import androidx.annotation.k1;
import androidx.media3.exoplayer.upstream.h;
import com.devtodev.core.data.consts.RequestParams;
import com.facebook.appevents.f0;
import com.facebook.appevents.internal.g;
import com.facebook.appevents.l0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f274672f = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Set<String> f274674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Handler f274675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final WeakReference<Activity> f274676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f274677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f274671e = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final Map<Integer, f> f274673g = new HashMap();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String c(String str, String str2) {
            return Intrinsics.areEqual("r2", str) ? new Regex("[^\\d.]").replace(str2, "") : str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:21:0x005e  */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final void d(Map<String, String> map, String str, String str2) {
            switch (str.hashCode()) {
                case 3585:
                    if (str.equals("r3")) {
                        String str3 = h.f66001o;
                        if (!StringsKt.u2(str2, h.f66001o, false, 2, null) && !StringsKt.u2(str2, "b", false, 2, null) && !StringsKt.u2(str2, l0.f99137p, false, 2, null)) {
                            str3 = RequestParams.F;
                        }
                        str2 = str3;
                    }
                    map.put(str, str2);
                    return;
                case 3586:
                    if (str.equals("r4")) {
                        str2 = new Regex("[^a-z]+").replace(str2, "");
                    }
                    map.put(str, str2);
                    return;
                case 3587:
                    if (str.equals("r5")) {
                        str2 = new Regex("[^a-z]+").replace(str2, "");
                    }
                    map.put(str, str2);
                    return;
                case 3588:
                    if (str.equals("r6") && StringsKt.V2(str2, "-", false, 2, null)) {
                        Object[] array = new Regex("-").o(str2, 0).toArray(new String[0]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                        str2 = ((String[]) array)[0];
                    }
                    map.put(str, str2);
                    return;
                default:
                    map.put(str, str2);
                    return;
            }
        }

        @n
        @k1
        public final void e(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            int iHashCode = activity.hashCode();
            Map mapB = f.b();
            Integer numValueOf = Integer.valueOf(iHashCode);
            Object fVar = mapB.get(numValueOf);
            if (fVar == null) {
                fVar = new f(activity, null);
                mapB.put(numValueOf, fVar);
            }
            f.c((f) fVar);
        }

        @n
        @k1
        public final void f(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            f fVar = (f) f.b().remove(Integer.valueOf(activity.hashCode()));
            if (fVar == null) {
                return;
            }
            f.d(fVar);
        }

        private a() {
        }
    }

    public /* synthetic */ f(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    public static final /* synthetic */ Map b() {
        if (com.facebook.internal.instrument.crashshield.b.e(f.class)) {
            return null;
        }
        try {
            return f274673g;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, f.class);
            return null;
        }
    }

    public static final /* synthetic */ void c(f fVar) {
        if (com.facebook.internal.instrument.crashshield.b.e(f.class)) {
            return;
        }
        try {
            fVar.i();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, f.class);
        }
    }

    public static final /* synthetic */ void d(f fVar) {
        if (com.facebook.internal.instrument.crashshield.b.e(f.class)) {
            return;
        }
        try {
            fVar.k();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, f.class);
        }
    }

    private final void e(final View view) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            h(new Runnable() { // from class: e5.e
                @Override // java.lang.Runnable
                public final void run() {
                    f.f(view, this);
                }
            });
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(View view, f this$0) {
        if (com.facebook.internal.instrument.crashshield.b.e(f.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "$view");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (view instanceof EditText) {
                this$0.g(view);
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, f.class);
        }
    }

    private final void g(View view) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            String string = ((EditText) view).getText().toString();
            if (string == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            String string2 = StringsKt.E5(string).toString();
            if (string2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = string2.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
            if (lowerCase.length() != 0 && !this.f274674a.contains(lowerCase) && lowerCase.length() <= 100) {
                this.f274674a.add(lowerCase);
                HashMap map = new HashMap();
                c cVar = c.f274659a;
                List<String> listB = c.b(view);
                List<String> listA = null;
                for (d dVar : d.f274661d.c()) {
                    a aVar = f274671e;
                    String strC = aVar.c(dVar.d(), lowerCase);
                    if (dVar.f().length() > 0) {
                        c cVar2 = c.f274659a;
                        if (!c.f(strC, dVar.f())) {
                        }
                    }
                    c cVar3 = c.f274659a;
                    if (c.e(listB, dVar.c())) {
                        aVar.d(map, dVar.d(), strC);
                    } else {
                        if (listA == null) {
                            listA = c.a(view);
                        }
                        if (c.e(listA, dVar.c())) {
                            aVar.d(map, dVar.d(), strC);
                        }
                    }
                }
                f0.f98865b.h(map);
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    private final void h(Runnable runnable) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.f274675b.post(runnable);
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    private final void i() {
        if (!com.facebook.internal.instrument.crashshield.b.e(this)) {
            try {
                if (!this.f274677d.getAndSet(true)) {
                    g gVar = g.f99011a;
                    View viewE = g.e(this.f274676c.get());
                    if (viewE != null) {
                        ViewTreeObserver viewTreeObserver = viewE.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.addOnGlobalFocusChangeListener(this);
                        }
                    }
                }
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
            }
        }
    }

    @n
    @k1
    public static final void j(@NotNull Activity activity) {
        if (com.facebook.internal.instrument.crashshield.b.e(f.class)) {
            return;
        }
        try {
            f274671e.e(activity);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, f.class);
        }
    }

    private final void k() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            if (this.f274677d.getAndSet(false)) {
                g gVar = g.f99011a;
                View viewE = g.e(this.f274676c.get());
                if (viewE == null) {
                    return;
                }
                ViewTreeObserver viewTreeObserver = viewE.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnGlobalFocusChangeListener(this);
                }
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    @n
    @k1
    public static final void l(@NotNull Activity activity) {
        if (com.facebook.internal.instrument.crashshield.b.e(f.class)) {
            return;
        }
        try {
            f274671e.f(activity);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, f.class);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(@Nullable View view, @Nullable View view2) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        if (view != null) {
            try {
                e(view);
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
                return;
            }
        }
        if (view2 != null) {
            e(view2);
        }
    }

    private f(Activity activity) {
        this.f274674a = new LinkedHashSet();
        this.f274675b = new Handler(Looper.getMainLooper());
        this.f274676c = new WeakReference<>(activity);
        this.f274677d = new AtomicBoolean(false);
    }
}
