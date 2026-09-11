package com.says.transittrack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.says.transittrack.databinding.ActivityMaps2Binding

class MapsActivity2 : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMaps2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMaps2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // Load the map fragment
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Updated coordinates
        val kandivali = LatLng(19.202762, 72.846154)

        // Add a marker
        mMap.addMarker(
            MarkerOptions()
                .position(kandivali)
                .title("Kandivali West, Mumbai")
                .snippet("Bhogilal Fadia Rd, Kandivali West")
        )

        // Move camera to the location with zoom
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(kandivali, 16f))
    }
}
