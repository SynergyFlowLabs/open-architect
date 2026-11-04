package androidx.databinding.adapters;

import android.widget.SearchView;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@androidx.databinding.h({@androidx.databinding.g(attribute = "android:onQueryTextFocusChange", method = "setOnQueryTextFocusChangeListener", type = SearchView.class), @androidx.databinding.g(attribute = "android:onSearchClick", method = "setOnSearchClickListener", type = SearchView.class), @androidx.databinding.g(attribute = "android:onClose", method = "setOnCloseListener", type = SearchView.class)})
@b1({b1.a.LIBRARY})
public class x {

    class a implements SearchView.OnQueryTextListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f49318a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f49319b;

        a(d dVar, c cVar) {
            this.f49318a = dVar;
            this.f49319b = cVar;
        }

        @Override // android.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextChange(String str) {
            c cVar = this.f49319b;
            if (cVar != null) {
                return cVar.onQueryTextChange(str);
            }
            return false;
        }

        @Override // android.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextSubmit(String str) {
            d dVar = this.f49318a;
            if (dVar != null) {
                return dVar.onQueryTextSubmit(str);
            }
            return false;
        }
    }

    class b implements SearchView.OnSuggestionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f49320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f49321b;

        b(f fVar, e eVar) {
            this.f49320a = fVar;
            this.f49321b = eVar;
        }

        @Override // android.widget.SearchView.OnSuggestionListener
        public boolean onSuggestionClick(int i10) {
            e eVar = this.f49321b;
            if (eVar != null) {
                return eVar.onSuggestionClick(i10);
            }
            return false;
        }

        @Override // android.widget.SearchView.OnSuggestionListener
        public boolean onSuggestionSelect(int i10) {
            f fVar = this.f49320a;
            if (fVar != null) {
                return fVar.onSuggestionSelect(i10);
            }
            return false;
        }
    }

    @e.b(11)
    public interface c {
        boolean onQueryTextChange(String str);
    }

    @e.b(11)
    public interface d {
        boolean onQueryTextSubmit(String str);
    }

    @e.b(11)
    public interface e {
        boolean onSuggestionClick(int i10);
    }

    @e.b(11)
    public interface f {
        boolean onSuggestionSelect(int i10);
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onQueryTextSubmit", "android:onQueryTextChange"})
    public static void a(SearchView searchView, d dVar, c cVar) {
        if (dVar == null && cVar == null) {
            searchView.setOnQueryTextListener(null);
        } else {
            searchView.setOnQueryTextListener(new a(dVar, cVar));
        }
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onSuggestionSelect", "android:onSuggestionClick"})
    public static void b(SearchView searchView, f fVar, e eVar) {
        if (fVar == null && eVar == null) {
            searchView.setOnSuggestionListener(null);
        } else {
            searchView.setOnSuggestionListener(new b(fVar, eVar));
        }
    }
}
