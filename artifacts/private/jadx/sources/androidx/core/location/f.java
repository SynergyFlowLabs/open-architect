package androidx.core.location;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface f extends LocationListener {
    @Override // android.location.LocationListener
    default void onFlushComplete(int i10) {
    }

    @Override // android.location.LocationListener
    default void onLocationChanged(@NonNull List<Location> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            onLocationChanged(list.get(i10));
        }
    }

    @Override // android.location.LocationListener
    default void onProviderDisabled(@NonNull String str) {
    }

    @Override // android.location.LocationListener
    default void onProviderEnabled(@NonNull String str) {
    }

    @Override // android.location.LocationListener
    default void onStatusChanged(@NonNull String str, int i10, @p0 Bundle bundle) {
    }
}
