package com.dylan.anotafacil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.LatLngBounds
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions

class AddAddressActivity : AppCompatActivity(), OnMapReadyCallback {
    private lateinit var map : GoogleMap
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_address)
        val fragmentMap = supportFragmentManager.findFragmentById(R.id.fragment_map) as SupportMapFragment
        fragmentMap.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        map = googleMap
        val lima = LatLng(-12.0431800, -77.0282400)
        val ica = LatLng(-14.0677700, -75.7286100)
        val arequipa = LatLng(-16.3988900, -71.5350000)
        map.addMarker(MarkerOptions().title("Lima").position(lima))
        map.addMarker(MarkerOptions().title("Arequipa").position(arequipa))
        map.addMarker(MarkerOptions().title("Ica").position(ica))
        //map.moveCamera(CameraUpdateFactory.newLatLngZoom(lima, 16F))
        val bounds = LatLngBounds.Builder()
        bounds.include(lima)
        bounds.include(ica)
        bounds.include(arequipa)
        map.animateCamera(CameraUpdateFactory.newLatLngBounds(bounds.build(), 150))
    }
}