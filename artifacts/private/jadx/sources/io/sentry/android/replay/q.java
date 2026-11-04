package io.sentry.android.replay;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.compose.runtime.internal.w0;
import io.sentry.m1;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
public final class q implements Closeable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f304958e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f304959f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f304960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f304961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final CopyOnWriteArrayList<f> f304962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final ArrayList<View> f304963d;

    public static final class a {

        /* JADX INFO: renamed from: io.sentry.android.replay.q$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nWindows.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Windows.kt\nio/sentry/android/replay/RootViewsSpy$Companion$install$1$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,210:1\n1#2:211\n*E\n"})
        static final class C2218a extends l0 implements Function1<ArrayList<View>, ArrayList<View>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ q f304964a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2218a(q qVar) {
                super(1);
                this.f304964a = qVar;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final ArrayList<View> invoke(ArrayList<View> mViews) throws Exception {
                Intrinsics.checkNotNullParameter(mViews, "mViews");
                m1 m1VarA = this.f304964a.f304961b.a();
                try {
                    ArrayList<View> arrayList = this.f304964a.f304963d;
                    arrayList.addAll(mViews);
                    kotlin.jdk7.a.c(m1VarA, null);
                    return arrayList;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        kotlin.jdk7.a.c(m1VarA, th2);
                        throw th3;
                    }
                }
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(q qVar) {
            if (qVar.f304960a.get()) {
                return;
            }
            b0.f304698a.e(new C2218a(qVar));
        }

        @NotNull
        public final q b() {
            final q qVar = new q(null);
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new Runnable() { // from class: io.sentry.android.replay.p
                @Override // java.lang.Runnable
                public final void run() {
                    q.a.c(qVar);
                }
            });
            return qVar;
        }

        private a() {
        }
    }

    @SourceDebugExtension({"SMAP\nWindows.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Windows.kt\nio/sentry/android/replay/RootViewsSpy$delegatingViewList$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,210:1\n1855#2:211\n1855#2,2:212\n1856#2:214\n1855#2,2:215\n1855#2,2:217\n*S KotlinDebug\n*F\n+ 1 Windows.kt\nio/sentry/android/replay/RootViewsSpy$delegatingViewList$1\n*L\n129#1:211\n130#1:212,2\n129#1:214\n137#1:215,2\n144#1:217,2\n*E\n"})
    public static final class b extends ArrayList<View> {
        b() {
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection<? extends View> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            for (f fVar : q.this.d()) {
                Iterator<T> it = elements.iterator();
                while (it.hasNext()) {
                    fVar.a((View) it.next(), true);
                }
            }
            return super.addAll(elements);
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean add(View element) {
            Intrinsics.checkNotNullParameter(element, "element");
            Iterator<T> it = q.this.d().iterator();
            while (it.hasNext()) {
                ((f) it.next()).a(element, true);
            }
            return super.add(element);
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof View) {
                return d((View) obj);
            }
            return false;
        }

        public /* bridge */ boolean d(View view) {
            return super.contains(view);
        }

        public /* bridge */ int i() {
            return super.size();
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof View) {
                return k((View) obj);
            }
            return -1;
        }

        public /* bridge */ int k(View view) {
            return super.indexOf(view);
        }

        public /* bridge */ int l(View view) {
            return super.lastIndexOf(view);
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof View) {
                return l((View) obj);
            }
            return -1;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final /* bridge */ View remove(int i10) {
            return r(i10);
        }

        public /* bridge */ boolean p(View view) {
            return super.remove(view);
        }

        public View r(int i10) {
            Object objRemove = super.remove(i10);
            Intrinsics.checkNotNullExpressionValue(objRemove, "removeAt(...)");
            View view = (View) objRemove;
            Iterator<T> it = q.this.d().iterator();
            while (it.hasNext()) {
                ((f) it.next()).a(view, false);
            }
            return view;
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ int size() {
            return i();
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean remove(Object obj) {
            if (obj instanceof View) {
                return p((View) obj);
            }
            return false;
        }
    }

    @SourceDebugExtension({"SMAP\nWindows.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Windows.kt\nio/sentry/android/replay/RootViewsSpy$listeners$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,210:1\n1855#2,2:211\n*S KotlinDebug\n*F\n+ 1 Windows.kt\nio/sentry/android/replay/RootViewsSpy$listeners$1\n*L\n119#1:211,2\n*E\n"})
    public static final class c extends CopyOnWriteArrayList<f> {
        c() {
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean add(f fVar) throws Exception {
            m1 m1VarA = q.this.f304961b.a();
            try {
                for (View view : q.this.f304963d) {
                    if (fVar != null) {
                        fVar.a(view, true);
                    }
                }
                Unit unit = Unit.f312394a;
                kotlin.jdk7.a.c(m1VarA, null);
                return super.add(fVar);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.jdk7.a.c(m1VarA, th2);
                    throw th3;
                }
            }
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof f) {
                return d((f) obj);
            }
            return false;
        }

        public /* bridge */ boolean d(f fVar) {
            return super.contains(fVar);
        }

        public /* bridge */ int i() {
            return super.size();
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj == null ? true : obj instanceof f) {
                return k((f) obj);
            }
            return -1;
        }

        public /* bridge */ int k(f fVar) {
            return super.indexOf(fVar);
        }

        public /* bridge */ int l(f fVar) {
            return super.lastIndexOf(fVar);
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj == null ? true : obj instanceof f) {
                return l((f) obj);
            }
            return -1;
        }

        public final /* bridge */ f n(int i10) {
            return r(i10);
        }

        public /* bridge */ boolean p(f fVar) {
            return super.remove(fVar);
        }

        public /* bridge */ f r(int i10) {
            return (f) super.remove(i10);
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
        public final /* bridge */ boolean remove(Object obj) {
            if (obj == null ? true : obj instanceof f) {
                return p((f) obj);
            }
            return false;
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return i();
        }
    }

    public /* synthetic */ q(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f304960a.set(true);
        this.f304962c.clear();
    }

    @NotNull
    public final CopyOnWriteArrayList<f> d() {
        return this.f304962c;
    }

    private q() {
        this.f304960a = new AtomicBoolean(false);
        this.f304961b = new io.sentry.util.a();
        this.f304962c = new c();
        this.f304963d = new b();
    }
}
