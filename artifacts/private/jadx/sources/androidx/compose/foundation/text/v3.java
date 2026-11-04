package androidx.compose.foundation.text;

import android.view.KeyEvent;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class v3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final u3 f21683a = new c(a(new kotlin.jvm.internal.e1() { // from class: androidx.compose.foundation.text.v3.b
        @Override // kotlin.jvm.internal.e1, kotlin.reflect.q
        public Object get(Object obj) {
            return Boolean.valueOf(androidx.compose.ui.input.key.e.e(((androidx.compose.ui.input.key.c) obj).h()));
        }
    }));

    public static final class a implements u3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.ui.input.key.c, Boolean> f21684a;

        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super androidx.compose.ui.input.key.c, Boolean> function1) {
            this.f21684a = function1;
        }

        @Override // androidx.compose.foundation.text.u3
        public s3 a(KeyEvent keyEvent) {
            if (this.f21684a.invoke(androidx.compose.ui.input.key.c.a(keyEvent)).booleanValue() && androidx.compose.ui.input.key.e.g(keyEvent)) {
                if (androidx.compose.ui.input.key.b.E4(androidx.compose.ui.input.key.e.a(keyEvent), t4.f21583a.z())) {
                    return s3.REDO;
                }
                return null;
            }
            if (this.f21684a.invoke(androidx.compose.ui.input.key.c.a(keyEvent)).booleanValue()) {
                long jA = androidx.compose.ui.input.key.e.a(keyEvent);
                t4 t4Var = t4.f21583a;
                if (!androidx.compose.ui.input.key.b.E4(jA, t4Var.d()) && !androidx.compose.ui.input.key.b.E4(jA, t4Var.o())) {
                    if (androidx.compose.ui.input.key.b.E4(jA, t4Var.w())) {
                        return s3.PASTE;
                    }
                    if (androidx.compose.ui.input.key.b.E4(jA, t4Var.x())) {
                        return s3.CUT;
                    }
                    if (androidx.compose.ui.input.key.b.E4(jA, t4Var.a())) {
                        return s3.SELECT_ALL;
                    }
                    if (androidx.compose.ui.input.key.b.E4(jA, t4Var.y())) {
                        return s3.REDO;
                    }
                    if (androidx.compose.ui.input.key.b.E4(jA, t4Var.z())) {
                        return s3.UNDO;
                    }
                    return null;
                }
                return s3.COPY;
            }
            if (androidx.compose.ui.input.key.e.e(keyEvent)) {
                return null;
            }
            if (androidx.compose.ui.input.key.e.g(keyEvent)) {
                long jA2 = androidx.compose.ui.input.key.e.a(keyEvent);
                t4 t4Var2 = t4.f21583a;
                if (androidx.compose.ui.input.key.b.E4(jA2, t4Var2.j())) {
                    return s3.SELECT_LEFT_CHAR;
                }
                if (androidx.compose.ui.input.key.b.E4(jA2, t4Var2.k())) {
                    return s3.SELECT_RIGHT_CHAR;
                }
                if (androidx.compose.ui.input.key.b.E4(jA2, t4Var2.l())) {
                    return s3.SELECT_UP;
                }
                if (androidx.compose.ui.input.key.b.E4(jA2, t4Var2.i())) {
                    return s3.SELECT_DOWN;
                }
                if (androidx.compose.ui.input.key.b.E4(jA2, t4Var2.t())) {
                    return s3.SELECT_PAGE_UP;
                }
                if (androidx.compose.ui.input.key.b.E4(jA2, t4Var2.s())) {
                    return s3.SELECT_PAGE_DOWN;
                }
                if (androidx.compose.ui.input.key.b.E4(jA2, t4Var2.q())) {
                    return s3.SELECT_LINE_START;
                }
                if (androidx.compose.ui.input.key.b.E4(jA2, t4Var2.p())) {
                    return s3.SELECT_LINE_END;
                }
                if (androidx.compose.ui.input.key.b.E4(jA2, t4Var2.o())) {
                    return s3.PASTE;
                }
                return null;
            }
            long jA3 = androidx.compose.ui.input.key.e.a(keyEvent);
            t4 t4Var3 = t4.f21583a;
            if (androidx.compose.ui.input.key.b.E4(jA3, t4Var3.j())) {
                return s3.LEFT_CHAR;
            }
            if (androidx.compose.ui.input.key.b.E4(jA3, t4Var3.k())) {
                return s3.RIGHT_CHAR;
            }
            if (androidx.compose.ui.input.key.b.E4(jA3, t4Var3.l())) {
                return s3.UP;
            }
            if (androidx.compose.ui.input.key.b.E4(jA3, t4Var3.i())) {
                return s3.DOWN;
            }
            if (androidx.compose.ui.input.key.b.E4(jA3, t4Var3.h())) {
                return s3.CENTER;
            }
            if (androidx.compose.ui.input.key.b.E4(jA3, t4Var3.t())) {
                return s3.PAGE_UP;
            }
            if (androidx.compose.ui.input.key.b.E4(jA3, t4Var3.s())) {
                return s3.PAGE_DOWN;
            }
            if (androidx.compose.ui.input.key.b.E4(jA3, t4Var3.q())) {
                return s3.LINE_START;
            }
            if (androidx.compose.ui.input.key.b.E4(jA3, t4Var3.p())) {
                return s3.LINE_END;
            }
            if (!androidx.compose.ui.input.key.b.E4(jA3, t4Var3.m()) && !androidx.compose.ui.input.key.b.E4(jA3, t4Var3.r())) {
                if (androidx.compose.ui.input.key.b.E4(jA3, t4Var3.c())) {
                    return s3.DELETE_PREV_CHAR;
                }
                if (androidx.compose.ui.input.key.b.E4(jA3, t4Var3.g())) {
                    return s3.DELETE_NEXT_CHAR;
                }
                if (androidx.compose.ui.input.key.b.E4(jA3, t4Var3.u())) {
                    return s3.PASTE;
                }
                if (androidx.compose.ui.input.key.b.E4(jA3, t4Var3.f())) {
                    return s3.CUT;
                }
                if (androidx.compose.ui.input.key.b.E4(jA3, t4Var3.e())) {
                    return s3.COPY;
                }
                if (androidx.compose.ui.input.key.b.E4(jA3, t4Var3.v())) {
                    return s3.TAB;
                }
                return null;
            }
            return s3.NEW_LINE;
        }
    }

    public static final class c implements u3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u3 f21686a;

        c(u3 u3Var) {
            this.f21686a = u3Var;
        }

        @Override // androidx.compose.foundation.text.u3
        public s3 a(KeyEvent keyEvent) {
            s3 s3Var = null;
            if (androidx.compose.ui.input.key.e.g(keyEvent) && androidx.compose.ui.input.key.e.e(keyEvent)) {
                long jA = androidx.compose.ui.input.key.e.a(keyEvent);
                t4 t4Var = t4.f21583a;
                if (androidx.compose.ui.input.key.b.E4(jA, t4Var.j())) {
                    s3Var = s3.SELECT_LEFT_WORD;
                } else if (androidx.compose.ui.input.key.b.E4(jA, t4Var.k())) {
                    s3Var = s3.SELECT_RIGHT_WORD;
                } else if (androidx.compose.ui.input.key.b.E4(jA, t4Var.l())) {
                    s3Var = s3.SELECT_PREV_PARAGRAPH;
                } else if (androidx.compose.ui.input.key.b.E4(jA, t4Var.i())) {
                    s3Var = s3.SELECT_NEXT_PARAGRAPH;
                }
            } else if (androidx.compose.ui.input.key.e.e(keyEvent)) {
                long jA2 = androidx.compose.ui.input.key.e.a(keyEvent);
                t4 t4Var2 = t4.f21583a;
                if (androidx.compose.ui.input.key.b.E4(jA2, t4Var2.j())) {
                    s3Var = s3.LEFT_WORD;
                } else if (androidx.compose.ui.input.key.b.E4(jA2, t4Var2.k())) {
                    s3Var = s3.RIGHT_WORD;
                } else if (androidx.compose.ui.input.key.b.E4(jA2, t4Var2.l())) {
                    s3Var = s3.PREV_PARAGRAPH;
                } else if (androidx.compose.ui.input.key.b.E4(jA2, t4Var2.i())) {
                    s3Var = s3.NEXT_PARAGRAPH;
                } else if (androidx.compose.ui.input.key.b.E4(jA2, t4Var2.n())) {
                    s3Var = s3.DELETE_PREV_CHAR;
                } else if (androidx.compose.ui.input.key.b.E4(jA2, t4Var2.g())) {
                    s3Var = s3.DELETE_NEXT_WORD;
                } else if (androidx.compose.ui.input.key.b.E4(jA2, t4Var2.c())) {
                    s3Var = s3.DELETE_PREV_WORD;
                } else if (androidx.compose.ui.input.key.b.E4(jA2, t4Var2.b())) {
                    s3Var = s3.DESELECT;
                }
            } else if (androidx.compose.ui.input.key.e.g(keyEvent)) {
                long jA3 = androidx.compose.ui.input.key.e.a(keyEvent);
                t4 t4Var3 = t4.f21583a;
                if (androidx.compose.ui.input.key.b.E4(jA3, t4Var3.q())) {
                    s3Var = s3.SELECT_LINE_START;
                } else if (androidx.compose.ui.input.key.b.E4(jA3, t4Var3.p())) {
                    s3Var = s3.SELECT_LINE_END;
                }
            } else if (androidx.compose.ui.input.key.e.d(keyEvent)) {
                long jA4 = androidx.compose.ui.input.key.e.a(keyEvent);
                t4 t4Var4 = t4.f21583a;
                if (androidx.compose.ui.input.key.b.E4(jA4, t4Var4.c())) {
                    s3Var = s3.DELETE_FROM_LINE_START;
                } else if (androidx.compose.ui.input.key.b.E4(jA4, t4Var4.g())) {
                    s3Var = s3.DELETE_TO_LINE_END;
                }
            }
            return s3Var == null ? this.f21686a.a(keyEvent) : s3Var;
        }
    }

    @NotNull
    public static final u3 a(@NotNull Function1<? super androidx.compose.ui.input.key.c, Boolean> function1) {
        return new a(function1);
    }

    @NotNull
    public static final u3 b() {
        return f21683a;
    }
}
