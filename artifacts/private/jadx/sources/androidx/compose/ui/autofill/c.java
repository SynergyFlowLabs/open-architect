package androidx.compose.ui.autofill;

import androidx.collection.k2;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.d0;
import androidx.compose.ui.semantics.z;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f36974a = "ComposeAutofillManager";

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(SemanticsConfiguration semanticsConfiguration) {
        return semanticsConfiguration.t().f(androidx.compose.ui.semantics.n.f41142a.k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(SemanticsConfiguration semanticsConfiguration) {
        return semanticsConfiguration.t().f(z.f41190a.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(SemanticsConfiguration semanticsConfiguration) {
        if (semanticsConfiguration.t().f(androidx.compose.ui.semantics.n.f41142a.k())) {
            return true;
        }
        k2<d0<?>, Object> k2VarT = semanticsConfiguration.t();
        z zVar = z.f41190a;
        return k2VarT.f(zVar.e()) || semanticsConfiguration.t().f(zVar.c());
    }
}
