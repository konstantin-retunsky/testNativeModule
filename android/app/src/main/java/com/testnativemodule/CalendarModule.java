package com.testnativemodule;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.Map;
import java.util.HashMap;

public class CalendarModule extends ReactContextBaseJavaModule {
	CalendarModule(ReactApplicationContext context) {
		super(context);
	}

	@Override
	public String getName() {
		return "CalendarModule";
	}

	@ReactMethod
	public void createCalendarEvent(String name, String location) {
		Log.d("CalendarModule", "Create event called with name: " + name + " and location: " + location);

		AppCompatActivity activity = (AppCompatActivity) getCurrentActivity();
		if (activity == null) return;

		AlertDialog alertDialog = new AlertDialog.Builder(activity).create();
//
//		// Указываем Title
		alertDialog.setTitle("Информационое сообщение");

		// Указываем текст сообщение
		alertDialog.setMessage("Welcome to devcolibri.com");

		// Обработчик на нажатие OK
		alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				// Код который выполнится после закрытия окна
				Toast.makeText(activity, "Вы нажали OK", Toast.LENGTH_SHORT).show();
			}
		});
//
//		// показываем Alert
		alertDialog.show();

//		MainActivity
	}
}