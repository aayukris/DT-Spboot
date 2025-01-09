package com.example.venueservice.Controller;

import com.example.venueservice.Model.ApiResponse;
import com.example.venueservice.Model.VenueAvailabilityModel;
import com.example.venueservice.Model.VenueModel;
import com.example.venueservice.Service.VenueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping("/api/venues")
public class VenueController {
    @Autowired
    private VenueService venueService;

    @PostMapping
    public ResponseEntity<ApiResponse> createVenue(@RequestBody VenueModel venueModel){
        VenueModel venueModel1 = venueService.createVenue(venueModel);
        return new ResponseEntity<>(new ApiResponse(true, "Venue Created Succesfully", venueModel1), HttpStatus.CREATED);
    }

    @GetMapping("/{venueId}")
    public ResponseEntity<ApiResponse> getVenue(@PathVariable("venueId") Long venueId){
        VenueModel venueModel1 = venueService.getVenue(venueId);
        return new ResponseEntity<>(new ApiResponse(true, "Venue Fetched Succesfully", venueModel1), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<ApiResponse> getAllVenues(){
        List<VenueModel> venues = venueService.getAllVenues();
        return new ResponseEntity<>(new ApiResponse(true, "All Venues Fetched Succesfully", venues), HttpStatus.OK);
    }

    @PutMapping("/{venueId}")
    public ResponseEntity<ApiResponse> updateVenue(@PathVariable("venueId") Long venueId, @RequestBody VenueModel venueModel){
        VenueModel updatedVenue = venueService.updateVenue(venueId,venueModel);
        return new ResponseEntity<>(new ApiResponse(true, "Venue updated Succesfully", updatedVenue), HttpStatus.OK);
    }

    @DeleteMapping("/{venueId}")
    public ResponseEntity<ApiResponse> deleteVenue(@PathVariable("venueId") Long venueId){
        String deleteMessage = venueService.deleteVenue(venueId);
        return new ResponseEntity<>(new ApiResponse(true, "Venue deleted Succesfully", deleteMessage), HttpStatus.OK);
    }

    @PostMapping("/{venueId}/bookVenue")
    public ResponseEntity<ApiResponse> bookVenue(@PathVariable("venueId") Long venueId, @RequestBody VenueAvailabilityModel availabilityModel){
        String bookingSuccess = venueService.bookVenue(venueId, availabilityModel);
        return new ResponseEntity<>(new ApiResponse(true, "Venue booked Succesfully", bookingSuccess), HttpStatus.OK);
    }

    @GetMapping("/{venueId}/bookedSlots")
    public ResponseEntity<ApiResponse> getBookedSlots(
            @PathVariable("venueId") Long venueId,
            @RequestParam(required = false) String date){
        List<VenueAvailabilityModel> availabilityModels = venueService.getBookedSlots(venueId, date);
        return new ResponseEntity<>(new ApiResponse(true, "Booked Slots Fetched Successfully", availabilityModels), HttpStatus.OK);
    }
}
