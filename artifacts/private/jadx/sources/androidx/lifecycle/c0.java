package androidx.lifecycle;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lifecycle.kt\nandroidx/lifecycle/Lifecycle\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,376:1\n1#2:377\n*E\n"})
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @NotNull
    private e<Object> f52169a = new e<>(null);

    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        private static final /* synthetic */ kotlin.enums.a $ENTRIES = kotlin.enums.c.c(k());

        @NotNull
        public static final C0471a Companion = new C0471a(null);

        /* JADX INFO: renamed from: androidx.lifecycle.c0$a$a, reason: collision with other inner class name */
        public static final class C0471a {

            /* JADX INFO: renamed from: androidx.lifecycle.c0$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C0472a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f52170a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[b.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f52170a = iArr;
                }
            }

            public /* synthetic */ C0471a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @oj.n
            @Nullable
            public final a a(@NotNull b state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i10 = C0472a.f52170a[state.ordinal()];
                if (i10 == 1) {
                    return a.ON_DESTROY;
                }
                if (i10 == 2) {
                    return a.ON_STOP;
                }
                if (i10 != 3) {
                    return null;
                }
                return a.ON_PAUSE;
            }

            @oj.n
            @Nullable
            public final a b(@NotNull b state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i10 = C0472a.f52170a[state.ordinal()];
                if (i10 == 1) {
                    return a.ON_STOP;
                }
                if (i10 == 2) {
                    return a.ON_PAUSE;
                }
                if (i10 != 4) {
                    return null;
                }
                return a.ON_DESTROY;
            }

            @oj.n
            @Nullable
            public final a c(@NotNull b state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i10 = C0472a.f52170a[state.ordinal()];
                if (i10 == 1) {
                    return a.ON_START;
                }
                if (i10 == 2) {
                    return a.ON_RESUME;
                }
                if (i10 != 5) {
                    return null;
                }
                return a.ON_CREATE;
            }

            @oj.n
            @Nullable
            public final a d(@NotNull b state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i10 = C0472a.f52170a[state.ordinal()];
                if (i10 == 1) {
                    return a.ON_CREATE;
                }
                if (i10 == 2) {
                    return a.ON_START;
                }
                if (i10 != 3) {
                    return null;
                }
                return a.ON_RESUME;
            }

            private C0471a() {
            }
        }

        public /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f52171a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[a.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f52171a = iArr;
            }
        }

        @oj.n
        @Nullable
        public static final a l(@NotNull b bVar) {
            return Companion.a(bVar);
        }

        @oj.n
        @Nullable
        public static final a n(@NotNull b bVar) {
            return Companion.b(bVar);
        }

        @NotNull
        public static kotlin.enums.a<a> o() {
            return $ENTRIES;
        }

        @oj.n
        @Nullable
        public static final a q(@NotNull b bVar) {
            return Companion.c(bVar);
        }

        @oj.n
        @Nullable
        public static final a r(@NotNull b bVar) {
            return Companion.d(bVar);
        }

        @NotNull
        public final b p() {
            switch (b.f52171a[ordinal()]) {
                case 1:
                case 2:
                    return b.CREATED;
                case 3:
                case 4:
                    return b.STARTED;
                case 5:
                    return b.RESUMED;
                case 6:
                    return b.DESTROYED;
                case 7:
                    throw new IllegalArgumentException(this + " has no target state");
                default:
                    throw new kotlin.k0();
            }
        }
    }

    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f52178g = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<b> l() {
            return f52178g;
        }

        public final boolean n(@NotNull b state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return compareTo(state) >= 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(kotlinx.coroutines.flow.k0 k0Var, o0 o0Var, a event) {
        Intrinsics.checkNotNullParameter(o0Var, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        k0Var.setValue(event.p());
    }

    @androidx.annotation.l0
    public abstract void c(@NotNull n0 n0Var);

    @androidx.annotation.l0
    @NotNull
    public abstract b d();

    @NotNull
    public kotlinx.coroutines.flow.z0<b> e() {
        final kotlinx.coroutines.flow.k0 k0VarA = kotlinx.coroutines.flow.b1.a(d());
        c(new j0() { // from class: androidx.lifecycle.b0
            @Override // androidx.lifecycle.j0
            public final void e(o0 o0Var, c0.a aVar) {
                c0.b(k0VarA, o0Var, aVar);
            }
        });
        return kotlinx.coroutines.flow.k.n(k0VarA);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @NotNull
    public final e<Object> f() {
        return this.f52169a;
    }

    @androidx.annotation.l0
    public abstract void g(@NotNull n0 n0Var);

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public final void h(@NotNull e<Object> eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.f52169a = eVar;
    }
}
