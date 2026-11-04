package ze;

import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.c1;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemGround;
import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.z;
import com.planner5d.library.services.utility.v1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f413491e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<b> f413492a = new c1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final c1<ItemMaterial> f413493b = new c1<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final c1<z> f413494c = new c1<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final c1<c> f413495d = new c1<>();

    /* JADX INFO: renamed from: ze.a$a, reason: collision with other inner class name */
    public interface InterfaceC2545a {
        void K(@NotNull a aVar);

        @NotNull
        a d();
    }

    @NotNull
    public final androidx.lifecycle.w0<b> a() {
        return this.f413492a;
    }

    @NotNull
    public final c1<ItemMaterial> b() {
        return this.f413493b;
    }

    @NotNull
    public final c1<c> c() {
        return this.f413495d;
    }

    @NotNull
    public final c1<z> d() {
        return this.f413494c;
    }

    public final void e(@Nullable b bVar) {
        Item itemH;
        androidx.lifecycle.w0<b> w0Var = this.f413492a;
        if (w0Var instanceof c1) {
            v1.f229769a.v((c1) w0Var, bVar);
        }
        v1 v1Var = v1.f229769a;
        ItemMaterial materialFloor = null;
        v1Var.v(this.f413495d, null);
        v1Var.v(this.f413494c, null);
        c1<ItemMaterial> c1Var = this.f413493b;
        if (bVar != null && (itemH = bVar.h()) != null && (itemH instanceof ItemGround) && !(itemH instanceof ItemRoom)) {
            materialFloor = ((ItemGround) itemH).getMaterialFloor();
        }
        v1Var.v(c1Var, materialFloor);
    }
}
