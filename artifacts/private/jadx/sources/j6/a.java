package j6;

import android.database.AbstractWindowedCursor;
import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.CursorWrapper;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public class a extends CursorWrapper implements CrossProcessCursor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AbstractWindowedCursor f307377a;

    @g6.a
    public a(@NonNull Cursor cursor) {
        super(cursor);
        for (int i10 = 0; i10 < 10 && (cursor instanceof CursorWrapper); i10++) {
            cursor = ((CursorWrapper) cursor).getWrappedCursor();
        }
        if (!(cursor instanceof AbstractWindowedCursor)) {
            throw new IllegalArgumentException("Unknown type: ".concat(cursor.getClass().getName()));
        }
        this.f307377a = (AbstractWindowedCursor) cursor;
    }

    @g6.a
    public void a(@p0 CursorWindow cursorWindow) {
        this.f307377a.setWindow(cursorWindow);
    }

    @Override // android.database.CrossProcessCursor
    @g6.a
    public void fillWindow(int i10, @NonNull CursorWindow cursorWindow) {
        this.f307377a.fillWindow(i10, cursorWindow);
    }

    @Override // android.database.CrossProcessCursor
    @p0
    @g6.a
    public CursorWindow getWindow() {
        return this.f307377a.getWindow();
    }

    @Override // android.database.CursorWrapper
    @NonNull
    public final /* synthetic */ Cursor getWrappedCursor() {
        return this.f307377a;
    }

    @Override // android.database.CrossProcessCursor
    public final boolean onMove(int i10, int i11) {
        return this.f307377a.onMove(i10, i11);
    }
}
