package androidx.compose.ui.graphics;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nAndroidGraphicsContext.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidGraphicsContext.android.kt\nandroidx/compose/ui/graphics/AndroidGraphicsContext\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,179:1\n1#2:180\n*E\n"})
final class g implements o1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final c f37767g = new c(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f37768h = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ViewGroup f37769a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.graphics.layer.view.a f37771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f37772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.graphics.shadow.k f37773e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f37770b = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final ComponentCallbacks2 f37774f = new a();

    public static final class a implements ComponentCallbacks2 {
        a() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i10) {
            if (i10 >= 40) {
                g.this.i();
            }
        }
    }

    public static final class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            g.this.l(view.getContext());
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            g.this.m(view.getContext());
            g.this.i();
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a() {
            return g.f37768h;
        }

        public final void b(boolean z10) {
            g.f37768h = z10;
        }

        private c() {
        }
    }

    @androidx.annotation.w0(29)
    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f37777a = new d();

        private d() {
        }

        @oj.n
        public static final long a(@NotNull View view) {
            return view.getUniqueDrawingId();
        }
    }

    public g(@NotNull ViewGroup viewGroup) {
        this.f37769a = viewGroup;
        if (viewGroup.isAttachedToWindow()) {
            l(viewGroup.getContext());
        }
        viewGroup.addOnAttachStateChangeListener(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        androidx.compose.ui.graphics.shadow.k kVar = this.f37773e;
        if (kVar != null) {
            kVar.a();
        }
        this.f37773e = null;
    }

    private final long j(View view) {
        return d.a(view);
    }

    private final androidx.compose.ui.graphics.layer.view.a k(ViewGroup viewGroup) {
        androidx.compose.ui.graphics.layer.view.a aVar = this.f37771c;
        if (aVar != null) {
            return aVar;
        }
        androidx.compose.ui.graphics.layer.view.c cVar = new androidx.compose.ui.graphics.layer.view.c(viewGroup.getContext());
        viewGroup.addView(cVar);
        this.f37771c = cVar;
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(Context context) {
        if (this.f37772d) {
            return;
        }
        context.getApplicationContext().registerComponentCallbacks(this.f37774f);
        this.f37772d = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(Context context) {
        if (this.f37772d) {
            context.getApplicationContext().unregisterComponentCallbacks(this.f37774f);
            this.f37772d = false;
        }
    }

    @Override // androidx.compose.ui.graphics.o1
    @NotNull
    public androidx.compose.ui.graphics.shadow.k a() {
        androidx.compose.ui.graphics.shadow.k kVarA = this.f37773e;
        if (kVarA == null) {
            kVarA = androidx.compose.ui.graphics.shadow.b.a();
            this.f37773e = kVarA;
        }
        return kVarA;
    }

    @Override // androidx.compose.ui.graphics.o1
    @NotNull
    public androidx.compose.ui.graphics.layer.c b() {
        androidx.compose.ui.graphics.layer.c cVar;
        synchronized (this.f37770b) {
            try {
                cVar = new androidx.compose.ui.graphics.layer.c(new androidx.compose.ui.graphics.layer.g(j(this.f37769a), null, null, 6, null));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    @Override // androidx.compose.ui.graphics.o1
    public void c(@NotNull androidx.compose.ui.graphics.layer.c cVar) {
        synchronized (this.f37770b) {
            try {
                cVar.S();
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
