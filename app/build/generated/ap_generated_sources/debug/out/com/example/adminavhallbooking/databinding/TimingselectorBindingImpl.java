package com.example.adminavhallbooking.databinding;
import com.example.adminavhallbooking.R;
import com.example.adminavhallbooking.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class TimingselectorBindingImpl extends TimingselectorBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cancelbutton, 1);
        sViewsWithIds.put(R.id.yeartext, 2);
        sViewsWithIds.put(R.id.radiogroup, 3);
        sViewsWithIds.put(R.id.radiofirst, 4);
        sViewsWithIds.put(R.id.radioother, 5);
        sViewsWithIds.put(R.id.simpletextavhalltime, 6);
        sViewsWithIds.put(R.id.starttimeselectbutton, 7);
        sViewsWithIds.put(R.id.endtimeselectbutton, 8);
        sViewsWithIds.put(R.id.starttimetextview, 9);
        sViewsWithIds.put(R.id.endtimetextview, 10);
        sViewsWithIds.put(R.id.lunchtimebutton, 11);
        sViewsWithIds.put(R.id.lunchtimetextview, 12);
        sViewsWithIds.put(R.id.donebutton, 13);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public TimingselectorBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private TimingselectorBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (com.google.android.material.button.MaterialButton) bindings[13]
            , (com.google.android.material.button.MaterialButton) bindings[8]
            , (android.widget.TextView) bindings[10]
            , (com.google.android.material.button.MaterialButton) bindings[11]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[12]
            , (android.widget.RadioButton) bindings[4]
            , (android.widget.RadioGroup) bindings[3]
            , (android.widget.RadioButton) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (com.google.android.material.button.MaterialButton) bindings[7]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[9]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}