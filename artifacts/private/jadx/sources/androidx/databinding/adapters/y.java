package androidx.databinding.adapters;

import android.widget.SeekBar;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
@androidx.databinding.q({@androidx.databinding.p(attribute = "android:progress", type = SeekBar.class)})
public class y {

    class a implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f49322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.databinding.o f49323b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f49324c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f49325d;

        a(b bVar, androidx.databinding.o oVar, c cVar, d dVar) {
            this.f49322a = bVar;
            this.f49323b = oVar;
            this.f49324c = cVar;
            this.f49325d = dVar;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            b bVar = this.f49322a;
            if (bVar != null) {
                bVar.onProgressChanged(seekBar, i10, z10);
            }
            androidx.databinding.o oVar = this.f49323b;
            if (oVar != null) {
                oVar.a();
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            c cVar = this.f49324c;
            if (cVar != null) {
                cVar.onStartTrackingTouch(seekBar);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            d dVar = this.f49325d;
            if (dVar != null) {
                dVar.onStopTrackingTouch(seekBar);
            }
        }
    }

    public interface b {
        void onProgressChanged(SeekBar seekBar, int i10, boolean z10);
    }

    public interface c {
        void onStartTrackingTouch(SeekBar seekBar);
    }

    public interface d {
        void onStopTrackingTouch(SeekBar seekBar);
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onStartTrackingTouch", "android:onStopTrackingTouch", "android:onProgressChanged", "android:progressAttrChanged"})
    public static void a(SeekBar seekBar, c cVar, d dVar, b bVar, androidx.databinding.o oVar) {
        if (cVar == null && dVar == null && bVar == null && oVar == null) {
            seekBar.setOnSeekBarChangeListener(null);
        } else {
            seekBar.setOnSeekBarChangeListener(new a(bVar, oVar, cVar, dVar));
        }
    }

    @androidx.databinding.d({"android:progress"})
    public static void b(SeekBar seekBar, int i10) {
        if (i10 != seekBar.getProgress()) {
            seekBar.setProgress(i10);
        }
    }
}
