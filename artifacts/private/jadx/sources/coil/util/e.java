package coil.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import okio.r0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@oj.i(name = "-FileSystems")
public final class e {
    public static final void a(@NotNull okio.v vVar, @NotNull r0 r0Var) {
        if (vVar.w(r0Var)) {
            return;
        }
        l.f(vVar.J(r0Var));
    }

    public static final void b(@NotNull okio.v vVar, @NotNull r0 r0Var) throws IOException {
        try {
            IOException iOException = null;
            for (r0 r0Var2 : vVar.y(r0Var)) {
                try {
                    if (vVar.D(r0Var2).j()) {
                        b(vVar, r0Var2);
                    }
                    vVar.q(r0Var2);
                } catch (IOException e10) {
                    if (iOException == null) {
                        iOException = e10;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }
}
