package space.kotik.katan;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.viewpager.widget.PagerAdapter;

public class ImageAdapter extends PagerAdapter {
    private Context mContext;
    private int[] mImageIds = new int[]{R.drawable.one1, R.drawable.one2, R.drawable.one3, R.drawable.one4, R.drawable.one5,
            R.drawable.one6, R.drawable.one7, R.drawable.one8, R.drawable.one9, R.drawable.one10,
            R.drawable.one11, R.drawable.one12, R.drawable.one13, R.drawable.one14, R.drawable.one15,
            R.drawable.one16, R.drawable.one17, R.drawable.one18, R.drawable.one19, R.drawable.one20};

    private int[] mImageId = new int[]{R.drawable.clz_book};
    ImageAdapter(Context context) {
        mContext = context;
    }
    @Override
    public int getCount() {
        return mImageIds.length;
    }
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView = new ImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageResource(mImageIds[position]);
        container.addView(imageView, 0);
        return imageView;
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((ImageView) object);
    }
}