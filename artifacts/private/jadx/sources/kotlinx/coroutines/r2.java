package kotlinx.coroutines;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@kotlin.a1
public class r2 extends w2 implements a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f315209c;

    public r2(@Nullable p2 p2Var) {
        super(true);
        q1(p2Var);
        this.f315209c = d2();
    }

    private final boolean d2() {
        w2 w2VarC;
        u uVarA1 = a1();
        v vVar = uVarA1 instanceof v ? (v) uVarA1 : null;
        if (vVar != null && (w2VarC = vVar.C()) != null) {
            while (!w2VarC.S0()) {
                u uVarA2 = w2VarC.a1();
                v vVar2 = uVarA2 instanceof v ? (v) uVarA2 : null;
                if (vVar2 == null || (w2VarC = vVar2.C()) == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.w2
    public boolean S0() {
        return this.f315209c;
    }

    @Override // kotlinx.coroutines.w2
    public boolean X0() {
        return true;
    }

    @Override // kotlinx.coroutines.a0
    public boolean complete() {
        return z1(Unit.f312394a);
    }

    @Override // kotlinx.coroutines.a0
    public boolean f(@NotNull Throwable th2) {
        return z1(new c0(th2, false, 2, null));
    }
}
